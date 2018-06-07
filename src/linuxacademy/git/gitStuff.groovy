package linuxacademy.git;

def gitCommit(gitPath) {
	def cmd = "/bin/git --git-dir='${gitPath}' rev-parse HEAD 2>&1"
	// def cmd = "git --version"
	return  cmd.execute().text.length()
}