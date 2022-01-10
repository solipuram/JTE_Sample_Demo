void call()
{
	stage("Docker:Build")
	{
		println"Docker Build Stage"
        sh "docker -v"
	}

}
