# Add Fractions
Small experiment for a Gradle multi-project with a library, a CLI, a simple servlet, a Spring service, and a OpenJFX GUI.

## Requirements
The OpenJFX GUI requires JDK 11. The other modules work also with JDK 8.

## Building & Running
```bash
# build all
./gradlew build

# run spring service
java -jar spring/build/libs/fadd-spring-1.0.0-SNAPSHOT.war

# run servlet webapp
./gradlew webapp:appRun

# build CLI extracted distribution
./gradlew installDist

# run CLI
./cli/build/install/fadd/bin/fadd 1 2 1 4

# run OpenJFX GUI
./gradlew jfxui:run

# build OpenJFX GUI extracted distribution
./gradlew installDist

# run OpenJFX GUI jar
./jfxui/build/install/fadd-ui/bin/fadd-ui
```

## Servlet
The `war` file `webapp/build/libs/fadd-webapp-1.0.0-SNAPSHOT.war` can be deployed to a Java servlet container. Alternatively, is is possible to use the Gradle gretty plugin to run the servlet with the `appRun` goal.

## Spring Web Service
The build produces the executable `war` file `spring/build/libs/fadd-spring-1.0.0-SNAPSHOT.war`.

Besides the web page at (by default) <http://localhost:8080>, a REST service is available as <http://localhost:8080/add?na=1&da=10&nb=1&db=100>.

### Standalone executable
When executed like a `jar` file, e.g., `java -jar spring/build/libs/fadd-spring-1.0.0-SNAPSHOT.war`, the web app supports the following parameters to specify the port and host for the service:
* `--port[=8080]`
* `--address[=localhost]`

### Servlet Container/Tomcat
Copy the `war` file to the appropriate directory, e.g., `webapps` for Tomcat.

The produced `war` file can be executed directly like a `jar` file or deployed to a servlet container.

## CLI
The CLI expects the two nominator denominator pairs and shows usage information when called without parameters. For example to add a half and a quarter, run `./cli/build/install/fadd/bin/fadd 1 2 1 4`.

### OpenJFX GUI
Then OpenJFX based UI can be built as described above.

## License
[The Unlicense](LICENSE).
