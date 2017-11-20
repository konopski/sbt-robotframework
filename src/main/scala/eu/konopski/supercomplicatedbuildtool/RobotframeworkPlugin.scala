package eu.konopski.supercomplicatedbuildtool

import sbt.Keys.commands
import sbt.{AutoPlugin, Command, State}

object RobotframeworkPlugin extends AutoPlugin {
  override lazy val projectSettings = Seq(commands += robotCommand)

  lazy val robotCommand =
     Command.args("robot", "<args>") { (state: State, args: Seq[String]) =>
        val runner = new org.robotframework.RobotRunner()
        val result = runner.run(args.toArray)
        if(result == 0) state
        else state.fail
     }
}
