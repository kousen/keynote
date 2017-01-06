#!/usr/bin/env groovy

Date electionDay = Date.parse('yyyy-MM-dd', '2020-11-03')
Date now = new Date()
println "${electionDay - now} days to go..."