# USE CASE: 3a Produce a Report on either the Top N Populated Cities in the world or Continent or Region or country or district, where N is Provided by the User.
## CHARACTERISTIC INFORMATION
### Goal in Context
As an organization worker I want to produce a report on the top N populated cities in the world and a report on the top N populated
cities in the continent,a report on the top N populated cities in the region a report on the top N populated
cities in the country a report on the top N populated cities in the district where N is provided by the user
so that I can support the reporting of the top N populated cities.

### Scope
Organization.

### Level
Primary task.

### Preconditions
Database contains country data.

### Success End Condition
A report is available for the organization to provide information on either the top N populated cities in the world,
or the top N populated cities in the continent, the top N populated cities in a region, 
or the top N populated cities in the country,or the top N populated cities in the district, where N is provided by the user.

### Failed End Condition
No report is produced.

### Primary Actor
Organization worker.

### Trigger
A request for this specific report is sent to the organization.

### MAIN SUCCESS SCENARIO
Organization requests information on either the top N populated cities in the world, continent, a region or country or district where N is provided by the user.
Organization worker triggers the report generation to extract either the top N populated world, continent, a region or country or district where N is provided by the user.
Organization worker provides report to organization.
### EXTENSIONS
Data does not exist:
Organization worker informs the organization no data exist.
### SUB-VARIATIONS
None.

SCHEDULE
DUE DATE: Release 1.0
