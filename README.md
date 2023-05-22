# Mars Rover Application

A Mars Rover Application is a Spring Boot-based REST API that allows controlling a rover robot's movement on the Martian terrain. The robot can be commanded to move and rotate within the specified terrain area.

## Requirements

- Java 8 or higher
- Maven

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/jvictorss/conta-azul-joao-victor

2. Navigate to the project directory:
  ```cd conta-azul-joao-victor```

3. Build the application using Maven:
  ```mvn clean install```

4. Run the application:
  ```mvn spring-boot:run```

### The application will start and be accessible at `http://localhost:8080`

## APIs endpoints:
### Execute Rover Commands:

Endpoint: POST /mars/{commands}
Description: It sends commands to the Mars Rover spacecraft to move over the terrain. You can send commands to the Rover through the variable path in the URL.
Response Body Example:
  (0, 3, N)

## Customizing the Terrain Size
By default, the terrain size is set to 5x5. If you want to customize the terrain size, you can modify the TERRAIN_SIZE constant in the RoverService class.

## Error Handling
If an invalid move or entry is detected, the application throws an InvalidMoveException or an InvalidEntryException, depending on the case. You can handle this exceptions and return an appropriate error response to the client.

## Contributing
Contributions are welcome! If you have any suggestions, improvements, or bug fixes, please submit a pull request.



