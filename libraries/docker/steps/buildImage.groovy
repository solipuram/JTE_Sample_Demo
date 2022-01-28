void call()
{
	stage("Docker:Build")
	{
		println"Docker Container Build Stage"
        sh "docker -v"
        sh "docker build -t ${config.image.name}:${BUILD_NUMBER} ${config.image.dir}"
        tag_image()
       
        //sh "docker images"
        // sh "docker rmi ${config.image.name}"
        // sh "docker images"
	}

}

void tag_image()
{
    echo "Image tagging method is called"
    //echo "docker tag ${config.image.name}:latest ${config.registry.url}/${config.registry.repository}:latest"
    //sh "docker tag ${config.image.name}:latest ${config.registry.url}/${config.registry.repository}:latest"
   
    echo "docker tag ${config.image.name}:${BUILD_NUMBER} ${config.registry.url}/${config.registry.repository}:${BUILD_NUMBER}"
    sh "docker tag ${config.image.name}:${BUILD_NUMBER} ${config.registry.url}/${config.registry.repository}:${BUILD_NUMBER}"
   
    sh "docker images"
}

