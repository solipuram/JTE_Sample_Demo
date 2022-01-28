libraries{
      hello
      git 
      {
            url = "https://github.com/solipuram/JTE_Sample_Demo.git"
            credentialsId = "ci_workflow_demo"
            branch = "dev"
      }
      docker{
          image{
              name= "flask-app"
              dir="."
          }
          login{
              DOCKER_USERNAME= "solipuramsrinivas"
              DOCKER_PASSWORD="239be91c-d39c-49f8-b1c4-039a3e1a39a2"
          }
          registry{
              url="solipuramsrinivas"
              repository="flask-demo"
          }
      }
  
}