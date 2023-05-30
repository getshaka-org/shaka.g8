lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "$organization$",
    name := "$name$",
    version := "$version$",
    versionScheme := Some("$version-scheme$"),

    scalaVersion := "3.3.0",
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "shaka" % "0.6.0"
    )
  )
