package linuxacademy.git;

def gitCommit(gitPath) {
	def cmd = "git --git-dir=\"${gitPath}\" rev-parse HEAD"
	return  cmd.execute().toString().trim()
}