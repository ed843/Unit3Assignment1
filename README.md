# API Testing with Carina Framework

Simple API testing project for ReqRes and JSONPlaceholder APIs.

## Setup

1. Prerequisites:
- JDK 11+
- Maven 3.6.0+

2. Install dependencies:
```bash
mvn clean install -DskipTests
```

## Project structure
```text
src/
├── main/java/com/solvd/eduncan/
│   ├── methods/
│   │   ├── reqres/           # ReqRes API methods
│   │   └── jsonplaceholder/  # JSONPlaceholder API methods
└── resources/
├── api/
│   ├── users/            # ReqRes templates
│   └── posts/            # JSONPlaceholder templates
├── _config.properties    # API URLs configuration
│    
└── test/java/tests       # Test classes
```

## Running Tests
From IDE:
- Right-click test class -> Run as TestNG Test
From Command Line:
```bash
- mvn clean test
```

## Test Reports
Find HTML reports in: `target/surefire-reports/index.html`