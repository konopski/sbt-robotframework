# sbt-robotframework
SBT plugin for running robotframework, it runs jython robotframework from maven artifactory. All arguments are passed as in jar version. 

# Plugin configuration

TODO :D

# Invocation
Note that SBT is running in build target folder, most probably not your build root. So it is easier to pass absolute paths.
eg. 

in windows cmd:

```sbt "robot run %CD%\src"```

in unix shell:

```sbt "robot run $PWD/src"```


###NOTE 
this version is yet buggy - report generation is broken due to classpath issue
