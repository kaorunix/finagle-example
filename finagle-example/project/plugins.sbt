// Comment to get more information during initialization
logLevel := Level.Warn

// -------------------------
// IntelliJ IDEA
// -------------------------
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.0")

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Spy Repository" at "http://files.couchbase.com/maven2"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.2")
