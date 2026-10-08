# Problem Statement:  
Create a script that validates YAML-based CI/CD pipeline configs for errors before deployment.

# Solution Outline:
Parse YAML file.
Check for required keys (jobs, steps).
Validate syntax and dependencies.

# Testcase:
# Input:
yaml
jobs:
  build:
    steps:
      - run: echo "Hello"
# Output:

# Code
Valid config
