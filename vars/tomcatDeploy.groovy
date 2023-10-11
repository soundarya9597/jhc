def call(ip,creds,warfiles){
                sshagent(['creds']) {
    // some block
    sh "scp -o StrictHostKeyChecking=no target/${warfile} ec2-user@${ip}:/opt/tomcat9/webapps"
    sh "ssh ec2-user@${ip} /opt/tomcat9/bin/shutdown.sh"
  sh "ssh ec2-user@${ip} /opt/tomcat9/bin/startup.sh"
    }
}
}
}
}
