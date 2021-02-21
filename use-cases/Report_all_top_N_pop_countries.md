# USE CASE: 6 Produce a Report on either the Top N Populated Countries in a Continent, a Region or the World, where N is Provided by the User.

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *organization worker* I want *to produce a report on the top N populated countries in a continent, a report on the top N populated countries in a region, and a report on the top N populated capital cities in the world, where N is provided by the user* so that *I can support the reporting of the top N populated capital cities.*

### Scope
Organization.

### Level
Primary task.

### Preconditions
Database contains population data.

### Success End Condition
A report is available for the organization to provide information on either the top N populated countries in a continent, the top N populated countries in a region, or the top N populated countries in the world, where N is provided by the user.

### Failed End Condition
No report is produced.

### Primary Actor
Organization worker.

### Trigger
A request for this specific report is sent to the organization.

### MAIN SUCCESS SCENARIO
1. Organization requests information on either the top N populated countries in a continent, a region or the world, where N is provided by the user.
2. Organization worker triggers the report generation to extract either the top N populated country in a continent, a region or the world, where N is provided by the user.
3. Organization worker provides report to organization.

### EXTENSIONS
2. **Data does not exist**:
    1. Organization worker informs the organization no data exist.

### SUB-VARIATIONS
None.

### SCHEDULE
**DUE DATE**: Release 1.0
