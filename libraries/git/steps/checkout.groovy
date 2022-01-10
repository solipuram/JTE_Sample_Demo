void call 
{
    stage("Git:Checkout")
    {
        container('jnlp')
        {
               echo " Working on Git Stage"

               git url: "${config.url}"
                   branch: "${config.git.branch}"
                   credentialsId: "${config.crednetialsId}"
        }
    }
}