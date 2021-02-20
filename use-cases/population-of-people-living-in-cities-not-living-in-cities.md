# USE CASE: 4 Produce a Report on all the Population of People, People Living in Cities, and People not Living in Cities, in either each Country, Continent or Region.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *organization worker* I want *to produce a report on all the population of people, people living in cities, and people not living in cities, in either each country, continent or region,* so that *I can support the reporting of the population of people living in cities or not living in cities.*

### Scope

Organization.

### Level

Primary task.

### Preconditions

Database contains the population data.

### Success End Condition

A report is available for the organization to provide information on all the population of people, people living in cities, and people not living in cities, in either each country, continent or region.

### Failed End Condition

No report is produced.

### Primary Actor

Organization worker.

### Trigger

A request for this specific report is sent to the organization.

## MAIN SUCCESS SCENARIO

1. Organization requests information on all the population of people, people living in cities, and people not living in cities, in either each country, continent or region.
2. Organization worker triggers the report generation to extract all the population of people, people living in cities, and people not living in cities, in either each country, continent or region.
3. Organization worker provides report to organization.

## EXTENSIONS

2. **Data does not exist**:
    1. Organization worker informs the organization no data exist.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0