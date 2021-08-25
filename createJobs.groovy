pipelineJob('pipelineJob') {
	definition {
		cps {
			script(readFileFromWorkspace('pipelineJob.groovy'))
			sandbox()
		}
	}
}
pipelineJob('favourite-quotes') {
	definition {
		cpsScm {
			scm {
				git {
					remote {
						url 'https://github.com/hlybt/favourite-quotes.git'
					}
					branch 'main'
				}
			}
		}
	}
}