package adaproject;

// Generated from C:\Users\samsung\Desktop\Ada.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AdaParser#iteration_scheme_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_scheme_opt(@NotNull AdaParser.Iteration_scheme_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#def_ids_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_ids_colon(@NotNull AdaParser.Def_ids_colonContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(@NotNull AdaParser.Func_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#mark_with_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMark_with_constraint(@NotNull AdaParser.Mark_with_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#task_items_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_items_opt(@NotNull AdaParser.Task_items_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#choice_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_s(@NotNull AdaParser.Choice_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(@NotNull AdaParser.Label_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#prot_op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProt_op_decl(@NotNull AdaParser.Prot_op_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#generic_formal_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_formal_parameter(@NotNull AdaParser.Generic_formal_parameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#constraint_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_opt(@NotNull AdaParser.Constraint_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_specification(@NotNull AdaParser.Parameter_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#body_is}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_is(@NotNull AdaParser.Body_isContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_index_spec_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_index_spec_opt(@NotNull AdaParser.Entry_index_spec_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(@NotNull AdaParser.PragmaContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#declare_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_opt(@NotNull AdaParser.Declare_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#abortable_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbortable_part(@NotNull AdaParser.Abortable_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#basic_declarative_items_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_declarative_items_opt(@NotNull AdaParser.Basic_declarative_items_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(@NotNull AdaParser.PrefixContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(@NotNull AdaParser.Return_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#digits_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits_constraint(@NotNull AdaParser.Digits_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#def_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_id(@NotNull AdaParser.Def_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#renames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenames(@NotNull AdaParser.RenamesContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#delay_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_stmt(@NotNull AdaParser.Delay_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(@NotNull AdaParser.ChoiceContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(@NotNull AdaParser.Compilation_unitContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#generic_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_inst(@NotNull AdaParser.Generic_instContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#component_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_items(@NotNull AdaParser.Component_itemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discriminant_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_constraint(@NotNull AdaParser.Discriminant_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#accept_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccept_stmt(@NotNull AdaParser.Accept_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#abort_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_stmt(@NotNull AdaParser.Abort_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#except_handler_part_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_handler_part_opt(@NotNull AdaParser.Except_handler_part_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#function_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_tail(@NotNull AdaParser.Function_tailContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#case_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stmt(@NotNull AdaParser.Case_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#or_select_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_select_opt(@NotNull AdaParser.Or_select_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull AdaParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#lib_pkg_spec_or_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib_pkg_spec_or_body(@NotNull AdaParser.Lib_pkg_spec_or_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#constant_all_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_all_opt(@NotNull AdaParser.Constant_all_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subprogram_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_body(@NotNull AdaParser.Subprogram_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#ranged_expr_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanged_expr_s(@NotNull AdaParser.Ranged_expr_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_body_formal_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_body_formal_part(@NotNull AdaParser.Entry_body_formal_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(@NotNull AdaParser.Package_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#prot_op_decl_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProt_op_decl_s(@NotNull AdaParser.Prot_op_decl_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#range_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_constraint(@NotNull AdaParser.Range_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#delta_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelta_constraint(@NotNull AdaParser.Delta_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#library_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_item(@NotNull AdaParser.Library_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discrim_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrim_part(@NotNull AdaParser.Discrim_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull AdaParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#task_definition_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_definition_opt(@NotNull AdaParser.Task_definition_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discriminant_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_association(@NotNull AdaParser.Discriminant_associationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#private_task_items_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_task_items_opt(@NotNull AdaParser.Private_task_items_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#func_formal_part_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_formal_part_opt(@NotNull AdaParser.Func_formal_part_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(@NotNull AdaParser.Null_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#aliased_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliased_opt(@NotNull AdaParser.Aliased_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subprog_decl_or_rename_or_inst_or_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl_or_rename_or_inst_or_body(@NotNull AdaParser.Subprog_decl_or_rename_or_inst_or_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#index_or_discrete_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_or_discrete_range(@NotNull AdaParser.Index_or_discrete_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#def_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_designator(@NotNull AdaParser.Def_designatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#protected_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_body(@NotNull AdaParser.Protected_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#variant_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant_part(@NotNull AdaParser.Variant_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#statement_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_identifier(@NotNull AdaParser.Statement_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#comp_loc_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_loc_s(@NotNull AdaParser.Comp_loc_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#selector_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_name(@NotNull AdaParser.Selector_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#abstract_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_opt(@NotNull AdaParser.Abstract_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#range_constraint_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_constraint_opt(@NotNull AdaParser.Range_constraint_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull AdaParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#local_enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_enum_name(@NotNull AdaParser.Local_enum_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(@NotNull AdaParser.RelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#component_subtype_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_subtype_def(@NotNull AdaParser.Component_subtype_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#identifier_colon_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_colon_opt(@NotNull AdaParser.Identifier_colon_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discrete_subtype_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_subtype_definition(@NotNull AdaParser.Discrete_subtype_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#ranged_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanged_expr(@NotNull AdaParser.Ranged_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#comp_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_decl(@NotNull AdaParser.Comp_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#range_attrib_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_attrib_ref(@NotNull AdaParser.Range_attrib_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarative_part(@NotNull AdaParser.Declarative_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#generic_subp_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_subp_inst(@NotNull AdaParser.Generic_subp_instContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#else_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_opt(@NotNull AdaParser.Else_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_index_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_index_opt(@NotNull AdaParser.Entry_index_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#compound_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_name(@NotNull AdaParser.Compound_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(@NotNull AdaParser.Exit_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#generic_formal_part_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_formal_part_opt(@NotNull AdaParser.Generic_formal_part_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull AdaParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull AdaParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#pragma_args_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_args_opt(@NotNull AdaParser.Pragma_args_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_call_stmt(@NotNull AdaParser.Entry_call_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#separate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparate(@NotNull AdaParser.SeparateContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#name_or_qualified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_or_qualified(@NotNull AdaParser.Name_or_qualifiedContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#context_items_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_items_opt(@NotNull AdaParser.Context_items_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#basic_declarative_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_declarative_items(@NotNull AdaParser.Basic_declarative_itemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#enum_id_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_id_s(@NotNull AdaParser.Enum_id_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#triggering_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggering_alternative(@NotNull AdaParser.Triggering_alternativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#enumeration_literal_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_literal_specification(@NotNull AdaParser.Enumeration_literal_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#private_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_opt(@NotNull AdaParser.Private_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarative_item(@NotNull AdaParser.Declarative_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#array_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type_definition(@NotNull AdaParser.Array_type_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_call_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_call_alternative(@NotNull AdaParser.Entry_call_alternativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#derived_or_private_or_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_or_private_or_record(@NotNull AdaParser.Derived_or_private_or_recordContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discrete_subtype_def_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_subtype_def_opt(@NotNull AdaParser.Discrete_subtype_def_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#record_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_definition(@NotNull AdaParser.Record_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discrete_with_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_with_range(@NotNull AdaParser.Discrete_with_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entrydecls_repspecs_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrydecls_repspecs_opt(@NotNull AdaParser.Entrydecls_repspecs_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#separate_or_abstract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparate_or_abstract(@NotNull AdaParser.Separate_or_abstractContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement_alternative(@NotNull AdaParser.Case_statement_alternativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#attribute_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_id(@NotNull AdaParser.Attribute_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(@NotNull AdaParser.DesignatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#component_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_list(@NotNull AdaParser.Component_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#body_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_part(@NotNull AdaParser.Body_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(@NotNull AdaParser.Exception_handlerContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_body(@NotNull AdaParser.Entry_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#until_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_opt(@NotNull AdaParser.Until_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#prot_type_or_single_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProt_type_or_single_decl(@NotNull AdaParser.Prot_type_or_single_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#except_choice_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_choice_s(@NotNull AdaParser.Except_choice_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#is_separate_or_abstract_or_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_separate_or_abstract_or_decl(@NotNull AdaParser.Is_separate_or_abstract_or_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#empty_discrim_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_discrim_opt(@NotNull AdaParser.Empty_discrim_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#handled_stmt_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandled_stmt_s(@NotNull AdaParser.Handled_stmt_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#operator_call_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_call_tail(@NotNull AdaParser.Operator_call_tailContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#align_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlign_opt(@NotNull AdaParser.Align_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#extension_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_opt(@NotNull AdaParser.Extension_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#parenth_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenth_values(@NotNull AdaParser.Parenth_valuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#value_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_s(@NotNull AdaParser.Value_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#alternative_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative_s(@NotNull AdaParser.Alternative_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#def_label_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_label_opt(@NotNull AdaParser.Def_label_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#range_or_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_or_mark(@NotNull AdaParser.Range_or_markContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discrete_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_range(@NotNull AdaParser.Discrete_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#empty_component_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_component_items(@NotNull AdaParser.Empty_component_itemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#pkg_body_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkg_body_part(@NotNull AdaParser.Pkg_body_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#decl_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_common(@NotNull AdaParser.Decl_commonContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull AdaParser.RangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#variant_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant_s(@NotNull AdaParser.Variant_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull AdaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_barrier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_barrier(@NotNull AdaParser.Entry_barrierContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(@NotNull AdaParser.Raise_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(@NotNull AdaParser.VariantContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#spec_decl_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_decl_part(@NotNull AdaParser.Spec_decl_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#abstract_tagged_limited_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_tagged_limited_opt(@NotNull AdaParser.Abstract_tagged_limited_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#id_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_opt(@NotNull AdaParser.Id_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#defining_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_identifier_list(@NotNull AdaParser.Defining_identifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(@NotNull AdaParser.Simple_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#pragma_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_arg(@NotNull AdaParser.Pragma_argContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(@NotNull AdaParser.Type_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subprog_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl(@NotNull AdaParser.Subprog_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#cond_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_clause(@NotNull AdaParser.Cond_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#pkg_spec_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkg_spec_part(@NotNull AdaParser.Pkg_spec_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#requeue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequeue_stmt(@NotNull AdaParser.Requeue_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discrim_part_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrim_part_text(@NotNull AdaParser.Discrim_part_textContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#prot_op_bodies_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProt_op_bodies_opt(@NotNull AdaParser.Prot_op_bodies_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#use_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_clause(@NotNull AdaParser.Use_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#call_or_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_or_assignment(@NotNull AdaParser.Call_or_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#access_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_opt(@NotNull AdaParser.Access_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#protected_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_definition(@NotNull AdaParser.Protected_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#range_dots}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_dots(@NotNull AdaParser.Range_dotsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#c_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_name_list(@NotNull AdaParser.C_name_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#allocator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocator(@NotNull AdaParser.AllocatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#operator_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_call(@NotNull AdaParser.Operator_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#task_type_or_single_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_type_or_single_decl(@NotNull AdaParser.Task_type_or_single_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#task_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_body(@NotNull AdaParser.Task_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#index_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_constraint(@NotNull AdaParser.Index_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#exception_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_choice(@NotNull AdaParser.Exception_choiceContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#enumeration_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_aggregate(@NotNull AdaParser.Enumeration_aggregateContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#generic_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_decl(@NotNull AdaParser.Generic_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(@NotNull AdaParser.If_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#elsifs_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsifs_opt(@NotNull AdaParser.Elsifs_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#delay_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_alternative(@NotNull AdaParser.Delay_alternativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#rep_spec_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep_spec_part(@NotNull AdaParser.Rep_spec_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#init_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_opt(@NotNull AdaParser.Init_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#protected_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_opt(@NotNull AdaParser.Protected_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#rep_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep_spec(@NotNull AdaParser.Rep_specContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subtype_ind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_ind(@NotNull AdaParser.Subtype_indContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubunit(@NotNull AdaParser.SubunitContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discriminant_specifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_specifications(@NotNull AdaParser.Discriminant_specificationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#in_access_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_access_opt(@NotNull AdaParser.In_access_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull AdaParser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#stmts_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts_opt(@NotNull AdaParser.Stmts_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull AdaParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#signed_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_term(@NotNull AdaParser.Signed_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#mode_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMode_opt(@NotNull AdaParser.Mode_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(@NotNull AdaParser.Loop_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#aliased_constant_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliased_constant_opt(@NotNull AdaParser.Aliased_constant_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discriminable_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminable_type_definition(@NotNull AdaParser.Discriminable_type_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#block_body_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_body_opt(@NotNull AdaParser.Block_body_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#index_or_discrete_range_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_or_discrete_range_s(@NotNull AdaParser.Index_or_discrete_range_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull AdaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#selector_names_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_names_opt(@NotNull AdaParser.Selector_names_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#definable_operator_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinable_operator_symbol(@NotNull AdaParser.Definable_operator_symbolContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#prot_member_decl_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProt_member_decl_s(@NotNull AdaParser.Prot_member_decl_sContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#end_id_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_id_opt(@NotNull AdaParser.End_id_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subprog_decl_or_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl_or_body(@NotNull AdaParser.Subprog_decl_or_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#reverse_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse_opt(@NotNull AdaParser.Reverse_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discriminant_direct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_direct_name(@NotNull AdaParser.Discriminant_direct_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#parenthesized_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_primary(@NotNull AdaParser.Parenthesized_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discriminant_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_specification(@NotNull AdaParser.Discriminant_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull AdaParser.Select_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#is_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_operator(@NotNull AdaParser.Is_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#accept_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccept_alternative(@NotNull AdaParser.Accept_alternativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#entry_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_declaration(@NotNull AdaParser.Entry_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#association_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation_head(@NotNull AdaParser.Association_headContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#access_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_type_definition(@NotNull AdaParser.Access_type_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#block_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_body(@NotNull AdaParser.Block_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subtype_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_mark(@NotNull AdaParser.Subtype_markContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#formal_package_actual_part_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_package_actual_part_opt(@NotNull AdaParser.Formal_package_actual_part_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#discrim_part_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrim_part_opt(@NotNull AdaParser.Discrim_part_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(@NotNull AdaParser.With_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#formal_part_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_part_opt(@NotNull AdaParser.Formal_part_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#basic_decl_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_decl_item(@NotNull AdaParser.Basic_decl_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#known_discrim_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnown_discrim_part(@NotNull AdaParser.Known_discrim_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#selective_accept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelective_accept(@NotNull AdaParser.Selective_acceptContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#goto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stmt(@NotNull AdaParser.Goto_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#guard_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_opt(@NotNull AdaParser.Guard_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull AdaParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#subprogram_default_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_default_opt(@NotNull AdaParser.Subprogram_default_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link AdaParser#select_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_alternative(@NotNull AdaParser.Select_alternativeContext ctx);
}