.class TreeUtils
.method static inserir(LBinaryTree;I) V
.limit locals 5
	aload_0
	getfield BinaryTree/root LNodeTree;
	ifnull L1
	aload_0
	getfield BinaryTree/root LNodeTree;
	astore_3
L3: aload_3
	astore 4
	iload_1
	aload 4
	getfield NodeTree/info I
	if_icmpgt L4
	iload_1
	aload 4
	getfield NodeTree/info I
	if_icmplt L7
	return
L7: aload 4
	getfield NodeTree/leftchild LNodeTree;
	astore_3
	aload_3
	ifnull L8
	goto L6
L8: new NodeTree
	astore_2
	aload_2
	iload_1
	invokespecial NodeTree/<init>(I) V
	aload 4
	aload_2
	putfield NodeTree/leftchild LNodeTree;
	aload_0
	getfield BinaryTree/root LNodeTree;
	invokestatic TreeUtils/atualizarAlturaNos(LNodeTree;) V
	goto L6
L4: aload 4
	getfield NodeTree/rightchild LNodeTree;
	astore_3
	aload_3
	ifnull L5
	goto L6
L5: new NodeTree
	astore_2
	aload_2
	iload_1
	invokespecial NodeTree/<init>(I) V
	aload 4
	aload_2
	putfield NodeTree/rightchild LNodeTree;
	aload_0
	getfield BinaryTree/root LNodeTree;
	invokestatic TreeUtils/atualizarAlturaNos(LNodeTree;) V
	goto L6
L6:	aload_3
	ifnonnull L3
	goto L2
L1:	new NodeTree
	astore_2
	aload_2
	iload_1
	invokespecial NodeTree/<init>(I) V
	aload_0
	aload_2
	putfield BinaryTree/root LNodeTree;
L2: aload_0
	aload_0
	getfield BinaryTree/size I
	iinc
	putfield BinaryTree/size I
	return
.end method
.method static buscar(LNodeTree;I) LNodeTree;
.limit locals 2
	aload_0
	ifnull L1
	iload_1
	aload_0
	getfield NodeTree/info I
	if_icmpeq L2
	iload_1
	aload_0
	getfield NodeTree/info I
	if_icmpgt L3
	aload_0
	getfield NodeTree/leftchild LNodeTree;
	iload_1
	invokestatic TreeUtils/buscar(LNodeTree;I) LNodeTree;
	areturn
L3: aload_0
	getfield NodeTree/rightchild LNodeTree;
	iload_1
	invokestatic TreeUtils/buscar(LNodeTree;I) LNodeTree;
	areturn
L2: aload_0
	areturn
L1:	aconst_null
	areturn
.end method
.method static altura(LNodeTree;) I
.limit locals 3
	aload_0
	ifnull L1
	aload_0
	getfield NodeTree/leftchild LNodeTree;
	invokestatic TreeUtils/altura(LNodeTree;) I
	istore_1
	aload_0
	getfield NodeTree/rightchild LNodeTree;
	invokestatic TreeUtils/altura(LNodeTree;) I
	istore_2
	iload_1
	iload_2
	if_icmplt L2
	iload_1
	iinc
	ireturn
L2:	iload_2
	iinc
	ireturn
L1:	iconst_m1
	ireturn
.end method
.method static atualizarAlturaNos(LNodeTree;) V
.limit locals 1
	aload_0
	ifnull L1
	aload_0
	aload_0
	invokestatic TreeUtils/altura(LNodeTree;) I
	putfield NodeTree/height I
	aload_0
	getfield NodeTree/rightchild LNodeTree;
	invokestatic TreeUtils/atualizarAlturaNos(LNodeTree;) V
	aload_0
	getfield NodeTree/leftchild LNodeTree;
	invokestatic TreeUtils/atualizarAlturaNos(LNodeTree;) V
L1:	return	
.end method
.end class