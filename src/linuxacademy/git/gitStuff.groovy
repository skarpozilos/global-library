package linuxacademy.git;

def gitCommit(gitPath) {
	// def cmd = "git --git-dir=\"${gitPath}\" rev-parse HEAD"
	def cmd = "git --version"
	return  cmd.execute().text.trim()
}