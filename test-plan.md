# Test Plan for Banking and Asset Movement Centre (BAM)

## Project Specific Impact to Testing

- **Project Phase:** Development
- **Technology Stack:** Banking and Asset Movement Centre (BAM)
- **Constraints:** Consolidating multiple systems into a unified interface
- **Assumptions:** Minimize errors and enhance efficiency
- **Critical Success Factors:** Streamline and centralize asset transfers
- **Project Geography:** Not specified

## Scope of Testing

### In-Scope Components

1. **Account to Account (A2A) retail transfers from BAM**
   - Description: Transfer of funds between accounts within the BAM system
   - Responsible side: Internal
   - Reference: BAM system documentation

2. **From and To account entry by branch user**
   - Description: Entry of source and destination accounts by branch users for transfers
   - Responsible side: Internal
   - Reference: BAM system documentation

3. **Transfer date entry (current and future up to 6 months)**
   - Description: Selection of transfer date within the current date and up to 6 months in the future
   - Responsible side: Internal
   - Reference: BAM system documentation

### Out-of-Scope Components

1. **External transfers**
   - Description: Transfers involving accounts outside the BAM system
   - Responsible side: N/A
   - Reference: N/A

2. **Check deposits**
   - Description: Deposits made via physical checks
   - Responsible side: N/A
   - Reference: N/A

### Third-Party Systems
- TBD

## Quality and Acceptance Criteria

1. **Minimize errors in asset transfers:**
   - Acceptance Criteria:
     - Successful A2A transfer execution.
     - Accurate entry of From and To accounts.
     - Correct transfer date selection and processing.

2. **Enhance efficiency for branch teams and home office operations:**
   - Acceptance Criteria:
     - Successful A2A transfer execution.
     - Accurate entry of From and To accounts.
     - Correct transfer date selection and processing.

## Test Process Description

### Planning Phase
- **Entry Criteria:**
  - Availability of functional requirements.
  - Approved design documents.
- **Exit Criteria:**
  - Test plan reviewed and approved.
  - Test cases prepared and baselined.

### Design Phase
- **Entry Criteria:**
  - Approved test plan.
  - Baseline test cases.
- **Exit Criteria:**
  - Test scenarios designed and reviewed.
  - Test data and environment setup completed.

### Execution Phase
- **Entry Criteria:**
  - Completed test environment setup.
  - Test scenarios and data available.
- **Exit Criteria:**
  - Test cases executed as per the test plan.
  - Defects logged and tracked.

### Reporting Phase
- **Entry Criteria:**
  - Completed test case execution.
  - Defects logged during execution.
- **Exit Criteria:**
  - Test summary report generated.
  - Defect closure verification.

## Defect Severity Definitions
- **Critical:** Any issue causing system crash or data loss.
- **Major:** Issues impacting core functionalities.
- **Minor:** Minor issues affecting non-core functionalities.
- **Cosmetic:** UI/UX issues with no functional impact.

## Test Case Creation and Management
- Test cases to cover all acceptance criteria.
- Each test case to have a unique identifier.
- Test cases to be reviewed and approved before execution.

## Defect Reporting and Lifecycle Management
- Defects to be logged in a defect tracking tool.
- Defect life cycle includes: New, Assigned, In Progress, Fixed, Retested, Closed.
- Defect closure after verification by the testing team.

## Testing Metrics and Tracking
- Metrics: Defect Density, Test Case Execution Productivity, Test Coverage.
- Tracking: Daily status reports, Defect Reports, Test Execution Reports.