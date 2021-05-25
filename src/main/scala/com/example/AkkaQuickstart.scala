package com.example

import akka.actor.{Actor, ActorSystem, Props}

class GreeterActor extends Actor {
  override def receive: Receive = {
    case message: String => println(s"Hello $message.")
    case _ => println("Undefined message.")
  }
}

object AkkaQuickstart extends App {
  val actorSystem = ActorSystem("GreeterActor")
  val greeterMain = actorSystem.actorOf(Props[GreeterActor], "GreeterActor")
  greeterMain ! "Charles"
}
