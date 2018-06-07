package linuxacademy.git;

def gitCommit(gitPath) {
	def cmd = "gita --git-dir=\"${gitPath}\" rev-parse HEAD"
	return  cmd.execute().text
}