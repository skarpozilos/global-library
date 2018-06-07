package linuxacademy.git;

def gitCommit(gitPath) {
	def cmd = "echo Testing; /bin/git --git-dir=\"${gitPath}\" rev-parse HEAD"
	return  cmd.execute().text
}