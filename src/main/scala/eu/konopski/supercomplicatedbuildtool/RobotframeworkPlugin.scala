package eu.konopski.supercomplicatedbuildtool

import sbt.Keys.commands
import sbt.{AutoPlugin, Command, State}

object RobotframeworkPlugin extends AutoPlugin {
  override lazy val projectSettings = Seq(commands += robotCommand)

  lazy val robotCommand =
     Command.command("robot") { (state: State) =>
        println("siemanko!")
        state
     }
}
