import sbt._

class MyProject(info: ProjectInfo) extends LWJGLProject(info) with JMonkey {
  override def targetedVersion = "$jmonkey_version$"
}
