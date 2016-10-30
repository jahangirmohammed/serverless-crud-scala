package todos

import java.util.UUID

import awscala._
import awscala.dynamodbv2._
import com.amazonaws.services.lambda.runtime.Context
import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization._

import scala.beans.BeanProperty
/**
  * Created by jahangir on 10/30/16.
  */
class Handler {

  implicit val dynamoDB = DynamoDB.at(Region.US_EAST_1)

  implicit val formats = Serialization.formats(NoTypeHints)

  val table: Table = dynamoDB.table("todos").get

  def getAll(input: GetAllRequest, context: Context): Response = {
    val results = table.scan(Seq("item" -> cond.isNotNull)).toList
    val resultsToMap = results.flatMap(res => res.attributes.filter(_.name == "item").map(attr => attr.value.s.get))
    Response(200, write(resultsToMap))
  }

  def create(input: CreateRequest, context: Context): Response = {
    val id = UUID.randomUUID().toString
    table.put(id,"item" -> input.body)
    Response(200,s"{id: $id}")
  }

}

class GetAllRequest

class CreateRequest(@BeanProperty var body: String) {
  def this() = this("")
}

case class Response(@BeanProperty statusCode: Int, @BeanProperty body: String)