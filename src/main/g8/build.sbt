lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "$organization$",
    name := "$name$",
    version := "$version$",
    versionScheme := Some("$version-scheme$"),

    scalaVersion := "3.0.0",
    // todo remove when fixed: https://github.com/lampepfl/dotty/issues/11943
    Compile / doc / sources := Seq(),
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "shaka" % "0.3.0"
    )
  )