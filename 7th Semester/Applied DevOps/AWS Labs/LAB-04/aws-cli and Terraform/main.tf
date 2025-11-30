terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 6.0"
    }
  }

  required_version = ">= 1.2.0"
}

provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "my_ec2_instance" {
  ami           = "ami-08c40ec9ead489470" # Example Ubuntu AMI
  instance_type = "t2.micro"

  tags = {
    Name = "Instance-by-TF"
  }
}
