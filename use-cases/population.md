# USE CASE: 8 Produce a Report on either the Population of the World, a Continent, a Region, a Country, a District or a City.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *organization worker* I want *to produce a report on the population of the world, a report on the population of a continent, a report on the population of a region, a report on the population of a country, a report on the population of a district, or a report on the population of a city,* so that *I can support the reporting of the population.*

### Scope

Organization.

### Level

Primary task.

### Preconditions

Database contains the population data.

### Success End Condition

A report is available for the organization to provide information on either the population of the world, a continent, a region, a country, a district or a city.

### Failed End Condition

No report is produced.

### Primary Actor

Organization worker.

### Trigger

A request for this specific report is sent to the organization.

## MAIN SUCCESS SCENARIO

1. Organization requests information on either the population of the world, a continent, a region, a country, a district or a city.
2. Organization worker triggers the report generation to extract either the population of the world, a continent, a region, a country, a district or a city.
3. Organization worker provides report to organization.

## EXTENSIONS

2. **Data does not exist**:
    1. Organization worker informs the organization that no data exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0