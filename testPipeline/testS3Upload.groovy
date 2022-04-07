stage("Upload"){

parameters {
    text( name: 'bucket')
    text( name: 'TAG_NAME')
    text( name: 'region' )

}
        def aws_credential = 'aws-test'
    
        steps{
                withAWS(region:"${region}", credentials:"${aws_credential}"){

                    s3Download(file:"${TAG_NAME}", bucket:"${bucket}", path:"")
                }
        }

}