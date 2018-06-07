package linuxacademy.git;

def gitCommit(gitPath) {
	def cmd = "/bin/git --git-dir='${gitPath}' rev-parse HEAD"
	// def cmd = "git --version"
	return  cmd.execute().text.length()
}