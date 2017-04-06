minimal repro of https://github.com/gradle/gradle/issues/1498
    
run `gradle compileScala` on gradle 3.3 or below, works.
gradle 3.4 or above fails with a javac compile error,
since somehow the lombok annotations aren't processed.

