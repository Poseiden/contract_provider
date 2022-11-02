package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should make a charge"

    request {
        url "/charge"
        method POST()
        headers {
            header 'Content-Type': 'application/json'
        }
        body  '''{ "userId" : "john", "amount": 100 }'''
    }

    response {
        status CREATED()
    }
}
