void call()
{
	stage("Docker:Build")
	{
		println"Docker Build Method"
        sh "docker -v"
        sh " docker images"
        sh "docker build -t ${config.image.name} ${config.image.dir}"

        sh "docker images"
	}

}
