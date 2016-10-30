package todos

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}

import scala.beans.BeanProperty

/**
  * Created by jahangir on 10/30/16.
  */
class Handler {

  def all(input: GetAllRequest, context: Context): Response = {
    Response(200, "{\"message\":\"All end-point!\"}")
  }

}


class GetAllRequest

case class Response(@BeanProperty statusCode: Int, @BeanProperty body: String)