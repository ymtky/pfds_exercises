trait Ordered{
  type T
  def eq(a: T): Boolean
  def lt(a: T): Boolean
  def leq(a: T): Boolean
}

trait Heap[+A <% Ordered[A]]{
  type A
  def empty: Heap[A]
  def isEmpty: Boolean
  def insert(a: A): Heap[A]
  def merge(a: Heap[A]): Heap[A]
  def findMain: T
  def deleteMin: Heap[A]
}

object LeftistHeap(element: T) extends Heap{
  val empty = Leaf

  case object Leaf extentds LeftistHeap{
  }

  case object Branch[+A <% Ordered[A]](
    elem: A,
    left: LeftistHeap[A]
    right: LeftistHeap[A]
  ) extends LeftistHeap[A] {
  }
}
