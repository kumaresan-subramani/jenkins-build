#!groovy

// Parameters used to pass on jenkins build
properties([[$class: 'BuildDiscarderProperty', strategy: [$class: 'LogRotator', artifactDaysToKeepStr: '7', artifactNumToKeepStr: '10', daysToKeepStr: '15', numToKeepStr: '10']]])

// global variables
sha = null;
projectId = null;
projectName = null;
mergeRequestDescription = null;
targetBranch = null;
commitStatusDesc = null;
gitlabToken = env.GITLAB_TOKEN;
gitlabAPI = 'https://gitlab.syncfusion.com/api/v3/projects';

// Get current project details
def getProjectDetails() {
}


// Check commit message for build setup
def checkCommitMessage() {}

// validate the branch name
def checkBranchName(){}

// throw branch error
def throwBranchError(String branchError) {
}

// validate the commit message
def validateCommitMessage(String message) {
}


// Execute commands and retrieve the output
def executeCommand(String command) {}

// trigger sample browser build
def triggerSampleBrowserBuild(){}

// Stage Install
def install() {
    validateMRDescription();
    runShell('git config --global core.longpaths true');
    runShell('node -v');
    runShell('npm --version');
    if(projectName != null && projectName == 'ej2-samples') {
        runShell('sudo npm cache clean --force');
    }
    runShell('npm install -g increase-memory-limit');
    runShell('increase-memory-limit');
    runShell('npm install');
    executeCommand('gulp ls-log');
}

// Stage Test
def test() {}

def artifactFiles() {}

def getArtifactFiles(String artiFiles) {}

// Stage Compile
def compile() {}

// Stage Publish
def publish() {}
