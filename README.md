# lms-project

A library management system built for the SEC321L software construction labs.

## Layout

| Path | Contents |
| --- | --- |
| `src/main/java/com/hitms/lms` | the service, the exceptions and the entry point |
| `src/main/java/com/hitms/lms/util` | shared helper methods |

## Build

```bash
mvn clean compile
mvn checkstyle:check
```

The build targets JDK 17 and keeps its style rules in `checkstyle.xml`.

## The service

`LibraryService` holds the catalogue and the add, issue and return operations.
Every method takes what it needs as an argument or returns the result, so the
class carries no shared static state and can be tested on its own.

Two checked exceptions report conditions that a caller is expected to handle:

- `BookUnavailableException` when a title has no copies left to issue.
- `MemberNotFoundException` when a member id is not on record.
