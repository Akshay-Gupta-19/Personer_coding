Êþº¾   4 
      java/lang/Object <init> ()V  java/util/ArrayList
  
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
     add (Ljava/lang/Object;)Z  java/util/HashMap
  
     size ()I
     get (I)Ljava/lang/Object;
    !  intValue # java/lang/Doubleÿð      ð       ) InterviewBit/Hashing/line
 ( +  , (DD)V
  . /  containsKey
  1 2 3 put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  5 6 7 keySet ()Ljava/util/Set; 9 : ; < = java/util/Set iterator ()Ljava/util/Iterator; ? @ A B C java/util/Iterator hasNext ()Z ? E F G next ()Ljava/lang/Object;
  I  J &(Ljava/lang/Object;)Ljava/lang/Object;
 L M N O P InterviewBit/Hashing/Fraction onLine  (LInterviewBit/Hashing/line;II)Z
 R S T U V java/lang/Math max (II)I	 X Y Z [ \ java/lang/System out Ljava/io/PrintStream;
 ^ _ ` a b java/io/PrintStream println (I)V	 ( d e f sloap D	 ( h i f inter Code LineNumberTable LocalVariableTable this LInterviewBit/Hashing/Fraction; main ([Ljava/lang/String;)V Nl LInterviewBit/Hashing/line; j I i on cl args [Ljava/lang/String; a Ljava/util/ArrayList; b hs Ljava/util/HashMap; ans it Ljava/util/Iterator; LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; CLjava/util/HashMap<LInterviewBit/Hashing/line;Ljava/lang/Integer;>; 1Ljava/util/Iterator<LInterviewBit/Hashing/line;>; StackMapTable y MethodParameters l 
SourceFile Fraction.java ! L           j   /     *· ±    k       9 l        m n   	 o p  j  *    » Y· 	L» Y· 	M+¸ 
¶ W+¸ 
¶ W+¸ 
¶ W,¸ 
¶ W,¸ 
¶ W,¸ 
¶ W» Y· N66,¶ ¢ ½`6,¶ ¢ ¨,¶ À ¶ ,¶ À ¶ g+¶ À ¶ +¶ À ¶ do9,¶ À ¶ +¶ À ¶ kg9	 $  &9	 $ +¶ À ¶ 9	» (Y	· *:-¶ - -¸ 
¶ 0W§ÿU§ÿ@-¶ 4¹ 8 :¹ >  k¹ D À (:6,¶ ¢ P-¶ HÀ ¶ 6+¶ À ¶ ,¶ À ¶ ¸ K -`¸ 
¶ 0W`¸ Q6§ÿ­§ÿ² W¶ ]±    k   r    ;  <  = + > F ? N @ Q A ] B l C ¤ D Ä E Ò F ê G ÷ H B A K" L, M8 ND OR Pr Q R N T U V l     ¤ g e f  Ä G i f 	 ÷  q r  c ® s t  T Ã u t R 9 v t ; V u t 8 Y w r    x y    z {   | {  NO } ~  QL  t " {       *   z    |   NO }  " {       ? ÿ T       ü ý nù  ú ú ü 
 ?ý  (ü Dø      x    O P  j        3*´ c & *´ g § ¬*´ ck*´ gc § ¬    k   
    X  Y l        3  r     3 z t    3 | t     	 @ @        z   |        