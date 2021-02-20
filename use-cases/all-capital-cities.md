# USE CASE: 3 Produce a Report on all the Capital Cities in either a Continent, a  Region or the World, organised by largest to smallest.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *organization worker* I want *to produce a report on all the capital cities in a continent, a report on all the capital cities in a region, or a report on all the capital cities in the world, organised by largest to smallest,* so that *I can support the reporting of all the capital cities.*

### Scope

Organization.

### Level

Primary task.

### Preconditions

Database contains country data.

### Success End Condition

A report is available for the organization to provide information on either all the capital cities in a continent, all the capital cities in a region, or all the capital cities in the world, organised by largest to smallest.

### Failed End Condition

No report is produced.

### Primary Actor

Organization worker.

### Trigger

A request for this specific report is sent to the organization.

## MAIN SUCCESS SCENARIO

1. Organization requests information on either all the capital cities in a continent, all the capital cities in a region, or all the capital cities in the world, organised by largest to smallest.
2. Organization worker triggers the report generation to extract either all the capital cities in a continent, all the capital cities in a region, or all the capital cities in the world, organised by largest to smallest.
3. Organization worker provides report to organization.

## EXTENSIONS

2. **Data does not exist**:
    1. Organization worker informs the organization no data exist.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0