void call()
{
	stage("Docker:Build")
	{
		println"Docker Build Method"
        sh "docker -v"
	}

}
