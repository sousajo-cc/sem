# USE CASE: 5 Produce a Report on all the Cities in either a Continent, a Country, a Region, a District or the World, Organised by Largest Population to Smallest.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *organization worker* I want *to produce a report on all the cities in a continent, a report on all the cities in the world, a report on all the cites in a region, a report on all the cites in a district, or a report on all the cites in a country, organised by largest population to smallest,* so that *I can support the reporting of all the cities.*

### Scope

Organization.

### Level

Primary task.

### Preconditions

Database contains country data.

### Success End Condition

A report is available for the organization to provide information on either all the cities in a continent, all the cities in a region, all the cities in the world, all the cities in a country, or all the cites in a district, organised by largest population to smallest.

### Failed End Condition

No report is produced.

### Primary Actor

Organization worker.

### Trigger

A request for this specific report is sent to the organization.

## MAIN SUCCESS SCENARIO

1. Organization requests information on either all the cities in a continent, all the cities in a region, all the cities in the world, all the cities in a country, or all the cites in a district, organised by largest population to smallest.
2. Organization worker triggers the report generation to extract either all the cities in a continent, all the cities in a region, all the cities in the world, all the cities in a country, or all the cites in a district, organised by largest population to smallest.
3. Organization worker provides report to organization.

## EXTENSIONS

2. **Data does not exist**:
    1. Organization worker informs the organization no data exist.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0