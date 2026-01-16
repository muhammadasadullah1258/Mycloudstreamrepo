#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Add default JVM options here.
DEFAULT_JVM_OPTS="-Xmx64m -Xms64m"

APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

# Use the maximum available, or set manually.
if [ -n "$JAVA_OPTS" ] ; then
    DEFAULT_JVM_OPTS="$DEFAULT_JVM_OPTS $JAVA_OPTS"
fi

warn () {
    echo "$*"
}

die () {
    echo
    echo "$*"
    echo
    exit 1
}

# Resolve links: $0 may be a softlink
PRG="$0"

while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

PRGDIR=`dirname "$PRG"`

# Determine Java command to use
if [ -n "$JAVA_HOME" ]; then
  JAVACMD="$JAVA_HOME/bin/java"
else
  JAVACMD="java"
fi

# Check if java exists
"$JAVACMD" -version > /dev/null 2>&1 || die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH."

# Setup Gradle home
GRADLE_HOME="$PRGDIR"

# For the wrapper, we need the jar
CLASSPATH="$PRGDIR/gradle/wrapper/gradle-wrapper.jar"

# Start Gradle
exec "$JAVACMD" $DEFAULT_JVM_OPTS -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
