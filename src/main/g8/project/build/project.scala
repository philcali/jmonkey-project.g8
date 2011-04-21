import sbt._

class MyProject(info: ProjectInfo) extends LWJGLProject(info) with JMonkey {
  override def targetedVersion = "2011-04-20"
}
