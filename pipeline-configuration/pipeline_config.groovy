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
              name= "python-demo"
              dir="."
          }
          login{
              DOCKER_USERNAME= "solipuramsrinivas"
              DOCKER_PASSWORD="Dhanu@9968"
          }
          registry{
              url="solipuramsrinivas"
              repository="docker-demo"
          }
      }
  
}