void call ()
{
    stage("Git:Checkout")
    {
        
            echo " Working on Git Stage"
            sh "id"
            sh "hostname"
            sh "uname -r"
             git url: "${config.url}", 
             credentialsId: "${config.crednetialsId}", 
             branch: "${config.branch}"
        
        
    }
}