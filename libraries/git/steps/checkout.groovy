void call 
{
    stage("Git:Checkout")
    {
        container('jnlp')
        {
               echo " Working on Git Stage"

               git url: "${config.url}",
                   credentialsId: "${config.crednetialsId}",
                   branch: "${config.git.branch}"
        }
    }
}