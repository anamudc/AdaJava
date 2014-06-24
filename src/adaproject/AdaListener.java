package adaproject;

// Generated from C:\Users\samsung\Desktop\Ada.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdaParser}.
 */
public interface AdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AdaParser#iteration_scheme_opt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_scheme_opt(@NotNull AdaParser.Iteration_scheme_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#iteration_scheme_opt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_scheme_opt(@NotNull AdaParser.Iteration_scheme_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#def_ids_colon}.
	 * @param ctx the parse tree
	 */
	void enterDef_ids_colon(@NotNull AdaParser.Def_ids_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#def_ids_colon}.
	 * @param ctx the parse tree
	 */
	void exitDef_ids_colon(@NotNull AdaParser.Def_ids_colonContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(@NotNull AdaParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(@NotNull AdaParser.Func_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#mark_with_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMark_with_constraint(@NotNull AdaParser.Mark_with_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#mark_with_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMark_with_constraint(@NotNull AdaParser.Mark_with_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#task_items_opt}.
	 * @param ctx the parse tree
	 */
	void enterTask_items_opt(@NotNull AdaParser.Task_items_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#task_items_opt}.
	 * @param ctx the parse tree
	 */
	void exitTask_items_opt(@NotNull AdaParser.Task_items_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#choice_s}.
	 * @param ctx the parse tree
	 */
	void enterChoice_s(@NotNull AdaParser.Choice_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#choice_s}.
	 * @param ctx the parse tree
	 */
	void exitChoice_s(@NotNull AdaParser.Choice_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(@NotNull AdaParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(@NotNull AdaParser.Label_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#prot_op_decl}.
	 * @param ctx the parse tree
	 */
	void enterProt_op_decl(@NotNull AdaParser.Prot_op_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#prot_op_decl}.
	 * @param ctx the parse tree
	 */
	void exitProt_op_decl(@NotNull AdaParser.Prot_op_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#generic_formal_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_formal_parameter(@NotNull AdaParser.Generic_formal_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#generic_formal_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_formal_parameter(@NotNull AdaParser.Generic_formal_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#constraint_opt}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_opt(@NotNull AdaParser.Constraint_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#constraint_opt}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_opt(@NotNull AdaParser.Constraint_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterParameter_specification(@NotNull AdaParser.Parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitParameter_specification(@NotNull AdaParser.Parameter_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#body_is}.
	 * @param ctx the parse tree
	 */
	void enterBody_is(@NotNull AdaParser.Body_isContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#body_is}.
	 * @param ctx the parse tree
	 */
	void exitBody_is(@NotNull AdaParser.Body_isContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_index_spec_opt}.
	 * @param ctx the parse tree
	 */
	void enterEntry_index_spec_opt(@NotNull AdaParser.Entry_index_spec_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_index_spec_opt}.
	 * @param ctx the parse tree
	 */
	void exitEntry_index_spec_opt(@NotNull AdaParser.Entry_index_spec_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(@NotNull AdaParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(@NotNull AdaParser.PragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#declare_opt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_opt(@NotNull AdaParser.Declare_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#declare_opt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_opt(@NotNull AdaParser.Declare_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#abortable_part}.
	 * @param ctx the parse tree
	 */
	void enterAbortable_part(@NotNull AdaParser.Abortable_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#abortable_part}.
	 * @param ctx the parse tree
	 */
	void exitAbortable_part(@NotNull AdaParser.Abortable_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#basic_declarative_items_opt}.
	 * @param ctx the parse tree
	 */
	void enterBasic_declarative_items_opt(@NotNull AdaParser.Basic_declarative_items_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#basic_declarative_items_opt}.
	 * @param ctx the parse tree
	 */
	void exitBasic_declarative_items_opt(@NotNull AdaParser.Basic_declarative_items_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(@NotNull AdaParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(@NotNull AdaParser.PrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(@NotNull AdaParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(@NotNull AdaParser.Return_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#digits_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDigits_constraint(@NotNull AdaParser.Digits_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#digits_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDigits_constraint(@NotNull AdaParser.Digits_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#def_id}.
	 * @param ctx the parse tree
	 */
	void enterDef_id(@NotNull AdaParser.Def_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#def_id}.
	 * @param ctx the parse tree
	 */
	void exitDef_id(@NotNull AdaParser.Def_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#renames}.
	 * @param ctx the parse tree
	 */
	void enterRenames(@NotNull AdaParser.RenamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#renames}.
	 * @param ctx the parse tree
	 */
	void exitRenames(@NotNull AdaParser.RenamesContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#delay_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelay_stmt(@NotNull AdaParser.Delay_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#delay_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelay_stmt(@NotNull AdaParser.Delay_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(@NotNull AdaParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(@NotNull AdaParser.ChoiceContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(@NotNull AdaParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(@NotNull AdaParser.Compilation_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#generic_inst}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_inst(@NotNull AdaParser.Generic_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#generic_inst}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_inst(@NotNull AdaParser.Generic_instContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#component_items}.
	 * @param ctx the parse tree
	 */
	void enterComponent_items(@NotNull AdaParser.Component_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#component_items}.
	 * @param ctx the parse tree
	 */
	void exitComponent_items(@NotNull AdaParser.Component_itemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discriminant_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_constraint(@NotNull AdaParser.Discriminant_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discriminant_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_constraint(@NotNull AdaParser.Discriminant_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#accept_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAccept_stmt(@NotNull AdaParser.Accept_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#accept_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAccept_stmt(@NotNull AdaParser.Accept_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAbort_stmt(@NotNull AdaParser.Abort_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAbort_stmt(@NotNull AdaParser.Abort_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#except_handler_part_opt}.
	 * @param ctx the parse tree
	 */
	void enterExcept_handler_part_opt(@NotNull AdaParser.Except_handler_part_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#except_handler_part_opt}.
	 * @param ctx the parse tree
	 */
	void exitExcept_handler_part_opt(@NotNull AdaParser.Except_handler_part_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#function_tail}.
	 * @param ctx the parse tree
	 */
	void enterFunction_tail(@NotNull AdaParser.Function_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#function_tail}.
	 * @param ctx the parse tree
	 */
	void exitFunction_tail(@NotNull AdaParser.Function_tailContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(@NotNull AdaParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(@NotNull AdaParser.Case_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#or_select_opt}.
	 * @param ctx the parse tree
	 */
	void enterOr_select_opt(@NotNull AdaParser.Or_select_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#or_select_opt}.
	 * @param ctx the parse tree
	 */
	void exitOr_select_opt(@NotNull AdaParser.Or_select_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull AdaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull AdaParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#lib_pkg_spec_or_body}.
	 * @param ctx the parse tree
	 */
	void enterLib_pkg_spec_or_body(@NotNull AdaParser.Lib_pkg_spec_or_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#lib_pkg_spec_or_body}.
	 * @param ctx the parse tree
	 */
	void exitLib_pkg_spec_or_body(@NotNull AdaParser.Lib_pkg_spec_or_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#constant_all_opt}.
	 * @param ctx the parse tree
	 */
	void enterConstant_all_opt(@NotNull AdaParser.Constant_all_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#constant_all_opt}.
	 * @param ctx the parse tree
	 */
	void exitConstant_all_opt(@NotNull AdaParser.Constant_all_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_body(@NotNull AdaParser.Subprogram_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_body(@NotNull AdaParser.Subprogram_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#ranged_expr_s}.
	 * @param ctx the parse tree
	 */
	void enterRanged_expr_s(@NotNull AdaParser.Ranged_expr_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#ranged_expr_s}.
	 * @param ctx the parse tree
	 */
	void exitRanged_expr_s(@NotNull AdaParser.Ranged_expr_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_body_formal_part}.
	 * @param ctx the parse tree
	 */
	void enterEntry_body_formal_part(@NotNull AdaParser.Entry_body_formal_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_body_formal_part}.
	 * @param ctx the parse tree
	 */
	void exitEntry_body_formal_part(@NotNull AdaParser.Entry_body_formal_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(@NotNull AdaParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(@NotNull AdaParser.Package_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#prot_op_decl_s}.
	 * @param ctx the parse tree
	 */
	void enterProt_op_decl_s(@NotNull AdaParser.Prot_op_decl_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#prot_op_decl_s}.
	 * @param ctx the parse tree
	 */
	void exitProt_op_decl_s(@NotNull AdaParser.Prot_op_decl_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void enterRange_constraint(@NotNull AdaParser.Range_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void exitRange_constraint(@NotNull AdaParser.Range_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#delta_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDelta_constraint(@NotNull AdaParser.Delta_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#delta_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDelta_constraint(@NotNull AdaParser.Delta_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#library_item}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_item(@NotNull AdaParser.Library_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#library_item}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_item(@NotNull AdaParser.Library_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discrim_part}.
	 * @param ctx the parse tree
	 */
	void enterDiscrim_part(@NotNull AdaParser.Discrim_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discrim_part}.
	 * @param ctx the parse tree
	 */
	void exitDiscrim_part(@NotNull AdaParser.Discrim_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull AdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull AdaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#task_definition_opt}.
	 * @param ctx the parse tree
	 */
	void enterTask_definition_opt(@NotNull AdaParser.Task_definition_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#task_definition_opt}.
	 * @param ctx the parse tree
	 */
	void exitTask_definition_opt(@NotNull AdaParser.Task_definition_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discriminant_association}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_association(@NotNull AdaParser.Discriminant_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discriminant_association}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_association(@NotNull AdaParser.Discriminant_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#private_task_items_opt}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_task_items_opt(@NotNull AdaParser.Private_task_items_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#private_task_items_opt}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_task_items_opt(@NotNull AdaParser.Private_task_items_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#func_formal_part_opt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_formal_part_opt(@NotNull AdaParser.Func_formal_part_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#func_formal_part_opt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_formal_part_opt(@NotNull AdaParser.Func_formal_part_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(@NotNull AdaParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(@NotNull AdaParser.Null_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#aliased_opt}.
	 * @param ctx the parse tree
	 */
	void enterAliased_opt(@NotNull AdaParser.Aliased_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#aliased_opt}.
	 * @param ctx the parse tree
	 */
	void exitAliased_opt(@NotNull AdaParser.Aliased_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subprog_decl_or_rename_or_inst_or_body}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_or_rename_or_inst_or_body(@NotNull AdaParser.Subprog_decl_or_rename_or_inst_or_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subprog_decl_or_rename_or_inst_or_body}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_or_rename_or_inst_or_body(@NotNull AdaParser.Subprog_decl_or_rename_or_inst_or_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#index_or_discrete_range}.
	 * @param ctx the parse tree
	 */
	void enterIndex_or_discrete_range(@NotNull AdaParser.Index_or_discrete_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#index_or_discrete_range}.
	 * @param ctx the parse tree
	 */
	void exitIndex_or_discrete_range(@NotNull AdaParser.Index_or_discrete_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#def_designator}.
	 * @param ctx the parse tree
	 */
	void enterDef_designator(@NotNull AdaParser.Def_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#def_designator}.
	 * @param ctx the parse tree
	 */
	void exitDef_designator(@NotNull AdaParser.Def_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#protected_body}.
	 * @param ctx the parse tree
	 */
	void enterProtected_body(@NotNull AdaParser.Protected_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#protected_body}.
	 * @param ctx the parse tree
	 */
	void exitProtected_body(@NotNull AdaParser.Protected_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#variant_part}.
	 * @param ctx the parse tree
	 */
	void enterVariant_part(@NotNull AdaParser.Variant_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#variant_part}.
	 * @param ctx the parse tree
	 */
	void exitVariant_part(@NotNull AdaParser.Variant_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#statement_identifier}.
	 * @param ctx the parse tree
	 */
	void enterStatement_identifier(@NotNull AdaParser.Statement_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#statement_identifier}.
	 * @param ctx the parse tree
	 */
	void exitStatement_identifier(@NotNull AdaParser.Statement_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#comp_loc_s}.
	 * @param ctx the parse tree
	 */
	void enterComp_loc_s(@NotNull AdaParser.Comp_loc_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#comp_loc_s}.
	 * @param ctx the parse tree
	 */
	void exitComp_loc_s(@NotNull AdaParser.Comp_loc_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void enterSelector_name(@NotNull AdaParser.Selector_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void exitSelector_name(@NotNull AdaParser.Selector_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#abstract_opt}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_opt(@NotNull AdaParser.Abstract_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#abstract_opt}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_opt(@NotNull AdaParser.Abstract_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#range_constraint_opt}.
	 * @param ctx the parse tree
	 */
	void enterRange_constraint_opt(@NotNull AdaParser.Range_constraint_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#range_constraint_opt}.
	 * @param ctx the parse tree
	 */
	void exitRange_constraint_opt(@NotNull AdaParser.Range_constraint_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull AdaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull AdaParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#local_enum_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_enum_name(@NotNull AdaParser.Local_enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#local_enum_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_enum_name(@NotNull AdaParser.Local_enum_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull AdaParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull AdaParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#component_subtype_def}.
	 * @param ctx the parse tree
	 */
	void enterComponent_subtype_def(@NotNull AdaParser.Component_subtype_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#component_subtype_def}.
	 * @param ctx the parse tree
	 */
	void exitComponent_subtype_def(@NotNull AdaParser.Component_subtype_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#identifier_colon_opt}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_colon_opt(@NotNull AdaParser.Identifier_colon_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#identifier_colon_opt}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_colon_opt(@NotNull AdaParser.Identifier_colon_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discrete_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_subtype_definition(@NotNull AdaParser.Discrete_subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discrete_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_subtype_definition(@NotNull AdaParser.Discrete_subtype_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#ranged_expr}.
	 * @param ctx the parse tree
	 */
	void enterRanged_expr(@NotNull AdaParser.Ranged_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#ranged_expr}.
	 * @param ctx the parse tree
	 */
	void exitRanged_expr(@NotNull AdaParser.Ranged_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#comp_decl}.
	 * @param ctx the parse tree
	 */
	void enterComp_decl(@NotNull AdaParser.Comp_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#comp_decl}.
	 * @param ctx the parse tree
	 */
	void exitComp_decl(@NotNull AdaParser.Comp_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#range_attrib_ref}.
	 * @param ctx the parse tree
	 */
	void enterRange_attrib_ref(@NotNull AdaParser.Range_attrib_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#range_attrib_ref}.
	 * @param ctx the parse tree
	 */
	void exitRange_attrib_ref(@NotNull AdaParser.Range_attrib_refContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterDeclarative_part(@NotNull AdaParser.Declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitDeclarative_part(@NotNull AdaParser.Declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#generic_subp_inst}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_subp_inst(@NotNull AdaParser.Generic_subp_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#generic_subp_inst}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_subp_inst(@NotNull AdaParser.Generic_subp_instContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#else_opt}.
	 * @param ctx the parse tree
	 */
	void enterElse_opt(@NotNull AdaParser.Else_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#else_opt}.
	 * @param ctx the parse tree
	 */
	void exitElse_opt(@NotNull AdaParser.Else_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_index_opt}.
	 * @param ctx the parse tree
	 */
	void enterEntry_index_opt(@NotNull AdaParser.Entry_index_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_index_opt}.
	 * @param ctx the parse tree
	 */
	void exitEntry_index_opt(@NotNull AdaParser.Entry_index_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#compound_name}.
	 * @param ctx the parse tree
	 */
	void enterCompound_name(@NotNull AdaParser.Compound_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#compound_name}.
	 * @param ctx the parse tree
	 */
	void exitCompound_name(@NotNull AdaParser.Compound_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(@NotNull AdaParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(@NotNull AdaParser.Exit_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#generic_formal_part_opt}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_formal_part_opt(@NotNull AdaParser.Generic_formal_part_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#generic_formal_part_opt}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_formal_part_opt(@NotNull AdaParser.Generic_formal_part_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull AdaParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull AdaParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull AdaParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull AdaParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#pragma_args_opt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_args_opt(@NotNull AdaParser.Pragma_args_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#pragma_args_opt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_args_opt(@NotNull AdaParser.Pragma_args_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEntry_call_stmt(@NotNull AdaParser.Entry_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEntry_call_stmt(@NotNull AdaParser.Entry_call_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#separate}.
	 * @param ctx the parse tree
	 */
	void enterSeparate(@NotNull AdaParser.SeparateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#separate}.
	 * @param ctx the parse tree
	 */
	void exitSeparate(@NotNull AdaParser.SeparateContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#name_or_qualified}.
	 * @param ctx the parse tree
	 */
	void enterName_or_qualified(@NotNull AdaParser.Name_or_qualifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#name_or_qualified}.
	 * @param ctx the parse tree
	 */
	void exitName_or_qualified(@NotNull AdaParser.Name_or_qualifiedContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#context_items_opt}.
	 * @param ctx the parse tree
	 */
	void enterContext_items_opt(@NotNull AdaParser.Context_items_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#context_items_opt}.
	 * @param ctx the parse tree
	 */
	void exitContext_items_opt(@NotNull AdaParser.Context_items_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#basic_declarative_items}.
	 * @param ctx the parse tree
	 */
	void enterBasic_declarative_items(@NotNull AdaParser.Basic_declarative_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#basic_declarative_items}.
	 * @param ctx the parse tree
	 */
	void exitBasic_declarative_items(@NotNull AdaParser.Basic_declarative_itemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#enum_id_s}.
	 * @param ctx the parse tree
	 */
	void enterEnum_id_s(@NotNull AdaParser.Enum_id_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#enum_id_s}.
	 * @param ctx the parse tree
	 */
	void exitEnum_id_s(@NotNull AdaParser.Enum_id_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#triggering_alternative}.
	 * @param ctx the parse tree
	 */
	void enterTriggering_alternative(@NotNull AdaParser.Triggering_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#triggering_alternative}.
	 * @param ctx the parse tree
	 */
	void exitTriggering_alternative(@NotNull AdaParser.Triggering_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#enumeration_literal_specification}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_literal_specification(@NotNull AdaParser.Enumeration_literal_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#enumeration_literal_specification}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_literal_specification(@NotNull AdaParser.Enumeration_literal_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#private_opt}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_opt(@NotNull AdaParser.Private_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#private_opt}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_opt(@NotNull AdaParser.Private_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclarative_item(@NotNull AdaParser.Declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclarative_item(@NotNull AdaParser.Declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_type_definition(@NotNull AdaParser.Array_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_type_definition(@NotNull AdaParser.Array_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_call_alternative}.
	 * @param ctx the parse tree
	 */
	void enterEntry_call_alternative(@NotNull AdaParser.Entry_call_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_call_alternative}.
	 * @param ctx the parse tree
	 */
	void exitEntry_call_alternative(@NotNull AdaParser.Entry_call_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#derived_or_private_or_record}.
	 * @param ctx the parse tree
	 */
	void enterDerived_or_private_or_record(@NotNull AdaParser.Derived_or_private_or_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#derived_or_private_or_record}.
	 * @param ctx the parse tree
	 */
	void exitDerived_or_private_or_record(@NotNull AdaParser.Derived_or_private_or_recordContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discrete_subtype_def_opt}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_subtype_def_opt(@NotNull AdaParser.Discrete_subtype_def_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discrete_subtype_def_opt}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_subtype_def_opt(@NotNull AdaParser.Discrete_subtype_def_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#record_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_definition(@NotNull AdaParser.Record_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#record_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_definition(@NotNull AdaParser.Record_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discrete_with_range}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_with_range(@NotNull AdaParser.Discrete_with_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discrete_with_range}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_with_range(@NotNull AdaParser.Discrete_with_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entrydecls_repspecs_opt}.
	 * @param ctx the parse tree
	 */
	void enterEntrydecls_repspecs_opt(@NotNull AdaParser.Entrydecls_repspecs_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entrydecls_repspecs_opt}.
	 * @param ctx the parse tree
	 */
	void exitEntrydecls_repspecs_opt(@NotNull AdaParser.Entrydecls_repspecs_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#separate_or_abstract}.
	 * @param ctx the parse tree
	 */
	void enterSeparate_or_abstract(@NotNull AdaParser.Separate_or_abstractContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#separate_or_abstract}.
	 * @param ctx the parse tree
	 */
	void exitSeparate_or_abstract(@NotNull AdaParser.Separate_or_abstractContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_alternative(@NotNull AdaParser.Case_statement_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_alternative(@NotNull AdaParser.Case_statement_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#attribute_id}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_id(@NotNull AdaParser.Attribute_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#attribute_id}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_id(@NotNull AdaParser.Attribute_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull AdaParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull AdaParser.DesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#component_list}.
	 * @param ctx the parse tree
	 */
	void enterComponent_list(@NotNull AdaParser.Component_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#component_list}.
	 * @param ctx the parse tree
	 */
	void exitComponent_list(@NotNull AdaParser.Component_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#body_part}.
	 * @param ctx the parse tree
	 */
	void enterBody_part(@NotNull AdaParser.Body_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#body_part}.
	 * @param ctx the parse tree
	 */
	void exitBody_part(@NotNull AdaParser.Body_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(@NotNull AdaParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(@NotNull AdaParser.Exception_handlerContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_body}.
	 * @param ctx the parse tree
	 */
	void enterEntry_body(@NotNull AdaParser.Entry_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_body}.
	 * @param ctx the parse tree
	 */
	void exitEntry_body(@NotNull AdaParser.Entry_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#until_opt}.
	 * @param ctx the parse tree
	 */
	void enterUntil_opt(@NotNull AdaParser.Until_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#until_opt}.
	 * @param ctx the parse tree
	 */
	void exitUntil_opt(@NotNull AdaParser.Until_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#prot_type_or_single_decl}.
	 * @param ctx the parse tree
	 */
	void enterProt_type_or_single_decl(@NotNull AdaParser.Prot_type_or_single_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#prot_type_or_single_decl}.
	 * @param ctx the parse tree
	 */
	void exitProt_type_or_single_decl(@NotNull AdaParser.Prot_type_or_single_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#except_choice_s}.
	 * @param ctx the parse tree
	 */
	void enterExcept_choice_s(@NotNull AdaParser.Except_choice_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#except_choice_s}.
	 * @param ctx the parse tree
	 */
	void exitExcept_choice_s(@NotNull AdaParser.Except_choice_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#is_separate_or_abstract_or_decl}.
	 * @param ctx the parse tree
	 */
	void enterIs_separate_or_abstract_or_decl(@NotNull AdaParser.Is_separate_or_abstract_or_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#is_separate_or_abstract_or_decl}.
	 * @param ctx the parse tree
	 */
	void exitIs_separate_or_abstract_or_decl(@NotNull AdaParser.Is_separate_or_abstract_or_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#empty_discrim_opt}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_discrim_opt(@NotNull AdaParser.Empty_discrim_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#empty_discrim_opt}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_discrim_opt(@NotNull AdaParser.Empty_discrim_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#handled_stmt_s}.
	 * @param ctx the parse tree
	 */
	void enterHandled_stmt_s(@NotNull AdaParser.Handled_stmt_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#handled_stmt_s}.
	 * @param ctx the parse tree
	 */
	void exitHandled_stmt_s(@NotNull AdaParser.Handled_stmt_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#operator_call_tail}.
	 * @param ctx the parse tree
	 */
	void enterOperator_call_tail(@NotNull AdaParser.Operator_call_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#operator_call_tail}.
	 * @param ctx the parse tree
	 */
	void exitOperator_call_tail(@NotNull AdaParser.Operator_call_tailContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#align_opt}.
	 * @param ctx the parse tree
	 */
	void enterAlign_opt(@NotNull AdaParser.Align_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#align_opt}.
	 * @param ctx the parse tree
	 */
	void exitAlign_opt(@NotNull AdaParser.Align_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#extension_opt}.
	 * @param ctx the parse tree
	 */
	void enterExtension_opt(@NotNull AdaParser.Extension_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#extension_opt}.
	 * @param ctx the parse tree
	 */
	void exitExtension_opt(@NotNull AdaParser.Extension_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#parenth_values}.
	 * @param ctx the parse tree
	 */
	void enterParenth_values(@NotNull AdaParser.Parenth_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#parenth_values}.
	 * @param ctx the parse tree
	 */
	void exitParenth_values(@NotNull AdaParser.Parenth_valuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#value_s}.
	 * @param ctx the parse tree
	 */
	void enterValue_s(@NotNull AdaParser.Value_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#value_s}.
	 * @param ctx the parse tree
	 */
	void exitValue_s(@NotNull AdaParser.Value_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#alternative_s}.
	 * @param ctx the parse tree
	 */
	void enterAlternative_s(@NotNull AdaParser.Alternative_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#alternative_s}.
	 * @param ctx the parse tree
	 */
	void exitAlternative_s(@NotNull AdaParser.Alternative_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#def_label_opt}.
	 * @param ctx the parse tree
	 */
	void enterDef_label_opt(@NotNull AdaParser.Def_label_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#def_label_opt}.
	 * @param ctx the parse tree
	 */
	void exitDef_label_opt(@NotNull AdaParser.Def_label_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#range_or_mark}.
	 * @param ctx the parse tree
	 */
	void enterRange_or_mark(@NotNull AdaParser.Range_or_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#range_or_mark}.
	 * @param ctx the parse tree
	 */
	void exitRange_or_mark(@NotNull AdaParser.Range_or_markContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_range(@NotNull AdaParser.Discrete_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_range(@NotNull AdaParser.Discrete_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#empty_component_items}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_component_items(@NotNull AdaParser.Empty_component_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#empty_component_items}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_component_items(@NotNull AdaParser.Empty_component_itemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#pkg_body_part}.
	 * @param ctx the parse tree
	 */
	void enterPkg_body_part(@NotNull AdaParser.Pkg_body_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#pkg_body_part}.
	 * @param ctx the parse tree
	 */
	void exitPkg_body_part(@NotNull AdaParser.Pkg_body_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#decl_common}.
	 * @param ctx the parse tree
	 */
	void enterDecl_common(@NotNull AdaParser.Decl_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#decl_common}.
	 * @param ctx the parse tree
	 */
	void exitDecl_common(@NotNull AdaParser.Decl_commonContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull AdaParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull AdaParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#variant_s}.
	 * @param ctx the parse tree
	 */
	void enterVariant_s(@NotNull AdaParser.Variant_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#variant_s}.
	 * @param ctx the parse tree
	 */
	void exitVariant_s(@NotNull AdaParser.Variant_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull AdaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull AdaParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_barrier}.
	 * @param ctx the parse tree
	 */
	void enterEntry_barrier(@NotNull AdaParser.Entry_barrierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_barrier}.
	 * @param ctx the parse tree
	 */
	void exitEntry_barrier(@NotNull AdaParser.Entry_barrierContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(@NotNull AdaParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(@NotNull AdaParser.Raise_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(@NotNull AdaParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(@NotNull AdaParser.VariantContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#spec_decl_part}.
	 * @param ctx the parse tree
	 */
	void enterSpec_decl_part(@NotNull AdaParser.Spec_decl_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#spec_decl_part}.
	 * @param ctx the parse tree
	 */
	void exitSpec_decl_part(@NotNull AdaParser.Spec_decl_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#abstract_tagged_limited_opt}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_tagged_limited_opt(@NotNull AdaParser.Abstract_tagged_limited_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#abstract_tagged_limited_opt}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_tagged_limited_opt(@NotNull AdaParser.Abstract_tagged_limited_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void enterId_opt(@NotNull AdaParser.Id_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void exitId_opt(@NotNull AdaParser.Id_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#defining_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterDefining_identifier_list(@NotNull AdaParser.Defining_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#defining_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitDefining_identifier_list(@NotNull AdaParser.Defining_identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(@NotNull AdaParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(@NotNull AdaParser.Simple_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#pragma_arg}.
	 * @param ctx the parse tree
	 */
	void enterPragma_arg(@NotNull AdaParser.Pragma_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#pragma_arg}.
	 * @param ctx the parse tree
	 */
	void exitPragma_arg(@NotNull AdaParser.Pragma_argContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(@NotNull AdaParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(@NotNull AdaParser.Type_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subprog_decl}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl(@NotNull AdaParser.Subprog_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subprog_decl}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl(@NotNull AdaParser.Subprog_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#cond_clause}.
	 * @param ctx the parse tree
	 */
	void enterCond_clause(@NotNull AdaParser.Cond_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#cond_clause}.
	 * @param ctx the parse tree
	 */
	void exitCond_clause(@NotNull AdaParser.Cond_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#pkg_spec_part}.
	 * @param ctx the parse tree
	 */
	void enterPkg_spec_part(@NotNull AdaParser.Pkg_spec_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#pkg_spec_part}.
	 * @param ctx the parse tree
	 */
	void exitPkg_spec_part(@NotNull AdaParser.Pkg_spec_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#requeue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRequeue_stmt(@NotNull AdaParser.Requeue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#requeue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRequeue_stmt(@NotNull AdaParser.Requeue_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discrim_part_text}.
	 * @param ctx the parse tree
	 */
	void enterDiscrim_part_text(@NotNull AdaParser.Discrim_part_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discrim_part_text}.
	 * @param ctx the parse tree
	 */
	void exitDiscrim_part_text(@NotNull AdaParser.Discrim_part_textContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#prot_op_bodies_opt}.
	 * @param ctx the parse tree
	 */
	void enterProt_op_bodies_opt(@NotNull AdaParser.Prot_op_bodies_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#prot_op_bodies_opt}.
	 * @param ctx the parse tree
	 */
	void exitProt_op_bodies_opt(@NotNull AdaParser.Prot_op_bodies_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_clause(@NotNull AdaParser.Use_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_clause(@NotNull AdaParser.Use_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#call_or_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCall_or_assignment(@NotNull AdaParser.Call_or_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#call_or_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCall_or_assignment(@NotNull AdaParser.Call_or_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#access_opt}.
	 * @param ctx the parse tree
	 */
	void enterAccess_opt(@NotNull AdaParser.Access_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#access_opt}.
	 * @param ctx the parse tree
	 */
	void exitAccess_opt(@NotNull AdaParser.Access_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#protected_definition}.
	 * @param ctx the parse tree
	 */
	void enterProtected_definition(@NotNull AdaParser.Protected_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#protected_definition}.
	 * @param ctx the parse tree
	 */
	void exitProtected_definition(@NotNull AdaParser.Protected_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#range_dots}.
	 * @param ctx the parse tree
	 */
	void enterRange_dots(@NotNull AdaParser.Range_dotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#range_dots}.
	 * @param ctx the parse tree
	 */
	void exitRange_dots(@NotNull AdaParser.Range_dotsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#c_name_list}.
	 * @param ctx the parse tree
	 */
	void enterC_name_list(@NotNull AdaParser.C_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#c_name_list}.
	 * @param ctx the parse tree
	 */
	void exitC_name_list(@NotNull AdaParser.C_name_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#allocator}.
	 * @param ctx the parse tree
	 */
	void enterAllocator(@NotNull AdaParser.AllocatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#allocator}.
	 * @param ctx the parse tree
	 */
	void exitAllocator(@NotNull AdaParser.AllocatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#operator_call}.
	 * @param ctx the parse tree
	 */
	void enterOperator_call(@NotNull AdaParser.Operator_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#operator_call}.
	 * @param ctx the parse tree
	 */
	void exitOperator_call(@NotNull AdaParser.Operator_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#task_type_or_single_decl}.
	 * @param ctx the parse tree
	 */
	void enterTask_type_or_single_decl(@NotNull AdaParser.Task_type_or_single_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#task_type_or_single_decl}.
	 * @param ctx the parse tree
	 */
	void exitTask_type_or_single_decl(@NotNull AdaParser.Task_type_or_single_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#task_body}.
	 * @param ctx the parse tree
	 */
	void enterTask_body(@NotNull AdaParser.Task_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#task_body}.
	 * @param ctx the parse tree
	 */
	void exitTask_body(@NotNull AdaParser.Task_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_constraint(@NotNull AdaParser.Index_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_constraint(@NotNull AdaParser.Index_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#exception_choice}.
	 * @param ctx the parse tree
	 */
	void enterException_choice(@NotNull AdaParser.Exception_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#exception_choice}.
	 * @param ctx the parse tree
	 */
	void exitException_choice(@NotNull AdaParser.Exception_choiceContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#enumeration_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_aggregate(@NotNull AdaParser.Enumeration_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#enumeration_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_aggregate(@NotNull AdaParser.Enumeration_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#generic_decl}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_decl(@NotNull AdaParser.Generic_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#generic_decl}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_decl(@NotNull AdaParser.Generic_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull AdaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull AdaParser.If_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#elsifs_opt}.
	 * @param ctx the parse tree
	 */
	void enterElsifs_opt(@NotNull AdaParser.Elsifs_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#elsifs_opt}.
	 * @param ctx the parse tree
	 */
	void exitElsifs_opt(@NotNull AdaParser.Elsifs_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#delay_alternative}.
	 * @param ctx the parse tree
	 */
	void enterDelay_alternative(@NotNull AdaParser.Delay_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#delay_alternative}.
	 * @param ctx the parse tree
	 */
	void exitDelay_alternative(@NotNull AdaParser.Delay_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#rep_spec_part}.
	 * @param ctx the parse tree
	 */
	void enterRep_spec_part(@NotNull AdaParser.Rep_spec_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#rep_spec_part}.
	 * @param ctx the parse tree
	 */
	void exitRep_spec_part(@NotNull AdaParser.Rep_spec_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#init_opt}.
	 * @param ctx the parse tree
	 */
	void enterInit_opt(@NotNull AdaParser.Init_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#init_opt}.
	 * @param ctx the parse tree
	 */
	void exitInit_opt(@NotNull AdaParser.Init_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#protected_opt}.
	 * @param ctx the parse tree
	 */
	void enterProtected_opt(@NotNull AdaParser.Protected_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#protected_opt}.
	 * @param ctx the parse tree
	 */
	void exitProtected_opt(@NotNull AdaParser.Protected_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#rep_spec}.
	 * @param ctx the parse tree
	 */
	void enterRep_spec(@NotNull AdaParser.Rep_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#rep_spec}.
	 * @param ctx the parse tree
	 */
	void exitRep_spec(@NotNull AdaParser.Rep_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subtype_ind}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_ind(@NotNull AdaParser.Subtype_indContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subtype_ind}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_ind(@NotNull AdaParser.Subtype_indContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subunit}.
	 * @param ctx the parse tree
	 */
	void enterSubunit(@NotNull AdaParser.SubunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subunit}.
	 * @param ctx the parse tree
	 */
	void exitSubunit(@NotNull AdaParser.SubunitContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discriminant_specifications}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_specifications(@NotNull AdaParser.Discriminant_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discriminant_specifications}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_specifications(@NotNull AdaParser.Discriminant_specificationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#in_access_opt}.
	 * @param ctx the parse tree
	 */
	void enterIn_access_opt(@NotNull AdaParser.In_access_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#in_access_opt}.
	 * @param ctx the parse tree
	 */
	void exitIn_access_opt(@NotNull AdaParser.In_access_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull AdaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull AdaParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#stmts_opt}.
	 * @param ctx the parse tree
	 */
	void enterStmts_opt(@NotNull AdaParser.Stmts_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#stmts_opt}.
	 * @param ctx the parse tree
	 */
	void exitStmts_opt(@NotNull AdaParser.Stmts_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull AdaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull AdaParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#signed_term}.
	 * @param ctx the parse tree
	 */
	void enterSigned_term(@NotNull AdaParser.Signed_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#signed_term}.
	 * @param ctx the parse tree
	 */
	void exitSigned_term(@NotNull AdaParser.Signed_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#mode_opt}.
	 * @param ctx the parse tree
	 */
	void enterMode_opt(@NotNull AdaParser.Mode_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#mode_opt}.
	 * @param ctx the parse tree
	 */
	void exitMode_opt(@NotNull AdaParser.Mode_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(@NotNull AdaParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(@NotNull AdaParser.Loop_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#aliased_constant_opt}.
	 * @param ctx the parse tree
	 */
	void enterAliased_constant_opt(@NotNull AdaParser.Aliased_constant_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#aliased_constant_opt}.
	 * @param ctx the parse tree
	 */
	void exitAliased_constant_opt(@NotNull AdaParser.Aliased_constant_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discriminable_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminable_type_definition(@NotNull AdaParser.Discriminable_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discriminable_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminable_type_definition(@NotNull AdaParser.Discriminable_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#block_body_opt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_body_opt(@NotNull AdaParser.Block_body_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#block_body_opt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_body_opt(@NotNull AdaParser.Block_body_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#index_or_discrete_range_s}.
	 * @param ctx the parse tree
	 */
	void enterIndex_or_discrete_range_s(@NotNull AdaParser.Index_or_discrete_range_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#index_or_discrete_range_s}.
	 * @param ctx the parse tree
	 */
	void exitIndex_or_discrete_range_s(@NotNull AdaParser.Index_or_discrete_range_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull AdaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull AdaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#selector_names_opt}.
	 * @param ctx the parse tree
	 */
	void enterSelector_names_opt(@NotNull AdaParser.Selector_names_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#selector_names_opt}.
	 * @param ctx the parse tree
	 */
	void exitSelector_names_opt(@NotNull AdaParser.Selector_names_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#definable_operator_symbol}.
	 * @param ctx the parse tree
	 */
	void enterDefinable_operator_symbol(@NotNull AdaParser.Definable_operator_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#definable_operator_symbol}.
	 * @param ctx the parse tree
	 */
	void exitDefinable_operator_symbol(@NotNull AdaParser.Definable_operator_symbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#prot_member_decl_s}.
	 * @param ctx the parse tree
	 */
	void enterProt_member_decl_s(@NotNull AdaParser.Prot_member_decl_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#prot_member_decl_s}.
	 * @param ctx the parse tree
	 */
	void exitProt_member_decl_s(@NotNull AdaParser.Prot_member_decl_sContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#end_id_opt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_id_opt(@NotNull AdaParser.End_id_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#end_id_opt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_id_opt(@NotNull AdaParser.End_id_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subprog_decl_or_body}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_or_body(@NotNull AdaParser.Subprog_decl_or_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subprog_decl_or_body}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_or_body(@NotNull AdaParser.Subprog_decl_or_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#reverse_opt}.
	 * @param ctx the parse tree
	 */
	void enterReverse_opt(@NotNull AdaParser.Reverse_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#reverse_opt}.
	 * @param ctx the parse tree
	 */
	void exitReverse_opt(@NotNull AdaParser.Reverse_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discriminant_direct_name}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_direct_name(@NotNull AdaParser.Discriminant_direct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discriminant_direct_name}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_direct_name(@NotNull AdaParser.Discriminant_direct_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#parenthesized_primary}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_primary(@NotNull AdaParser.Parenthesized_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#parenthesized_primary}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_primary(@NotNull AdaParser.Parenthesized_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discriminant_specification}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_specification(@NotNull AdaParser.Discriminant_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discriminant_specification}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_specification(@NotNull AdaParser.Discriminant_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull AdaParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull AdaParser.Select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#is_operator}.
	 * @param ctx the parse tree
	 */
	void enterIs_operator(@NotNull AdaParser.Is_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#is_operator}.
	 * @param ctx the parse tree
	 */
	void exitIs_operator(@NotNull AdaParser.Is_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#accept_alternative}.
	 * @param ctx the parse tree
	 */
	void enterAccept_alternative(@NotNull AdaParser.Accept_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#accept_alternative}.
	 * @param ctx the parse tree
	 */
	void exitAccept_alternative(@NotNull AdaParser.Accept_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#entry_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEntry_declaration(@NotNull AdaParser.Entry_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#entry_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEntry_declaration(@NotNull AdaParser.Entry_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#association_head}.
	 * @param ctx the parse tree
	 */
	void enterAssociation_head(@NotNull AdaParser.Association_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#association_head}.
	 * @param ctx the parse tree
	 */
	void exitAssociation_head(@NotNull AdaParser.Association_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type_definition(@NotNull AdaParser.Access_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type_definition(@NotNull AdaParser.Access_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#block_body}.
	 * @param ctx the parse tree
	 */
	void enterBlock_body(@NotNull AdaParser.Block_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#block_body}.
	 * @param ctx the parse tree
	 */
	void exitBlock_body(@NotNull AdaParser.Block_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subtype_mark}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_mark(@NotNull AdaParser.Subtype_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subtype_mark}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_mark(@NotNull AdaParser.Subtype_markContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#formal_package_actual_part_opt}.
	 * @param ctx the parse tree
	 */
	void enterFormal_package_actual_part_opt(@NotNull AdaParser.Formal_package_actual_part_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#formal_package_actual_part_opt}.
	 * @param ctx the parse tree
	 */
	void exitFormal_package_actual_part_opt(@NotNull AdaParser.Formal_package_actual_part_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#discrim_part_opt}.
	 * @param ctx the parse tree
	 */
	void enterDiscrim_part_opt(@NotNull AdaParser.Discrim_part_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#discrim_part_opt}.
	 * @param ctx the parse tree
	 */
	void exitDiscrim_part_opt(@NotNull AdaParser.Discrim_part_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull AdaParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull AdaParser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#formal_part_opt}.
	 * @param ctx the parse tree
	 */
	void enterFormal_part_opt(@NotNull AdaParser.Formal_part_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#formal_part_opt}.
	 * @param ctx the parse tree
	 */
	void exitFormal_part_opt(@NotNull AdaParser.Formal_part_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#basic_decl_item}.
	 * @param ctx the parse tree
	 */
	void enterBasic_decl_item(@NotNull AdaParser.Basic_decl_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#basic_decl_item}.
	 * @param ctx the parse tree
	 */
	void exitBasic_decl_item(@NotNull AdaParser.Basic_decl_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#known_discrim_part}.
	 * @param ctx the parse tree
	 */
	void enterKnown_discrim_part(@NotNull AdaParser.Known_discrim_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#known_discrim_part}.
	 * @param ctx the parse tree
	 */
	void exitKnown_discrim_part(@NotNull AdaParser.Known_discrim_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#selective_accept}.
	 * @param ctx the parse tree
	 */
	void enterSelective_accept(@NotNull AdaParser.Selective_acceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#selective_accept}.
	 * @param ctx the parse tree
	 */
	void exitSelective_accept(@NotNull AdaParser.Selective_acceptContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGoto_stmt(@NotNull AdaParser.Goto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGoto_stmt(@NotNull AdaParser.Goto_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#guard_opt}.
	 * @param ctx the parse tree
	 */
	void enterGuard_opt(@NotNull AdaParser.Guard_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#guard_opt}.
	 * @param ctx the parse tree
	 */
	void exitGuard_opt(@NotNull AdaParser.Guard_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull AdaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull AdaParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#subprogram_default_opt}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_default_opt(@NotNull AdaParser.Subprogram_default_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#subprogram_default_opt}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_default_opt(@NotNull AdaParser.Subprogram_default_optContext ctx);

	/**
	 * Enter a parse tree produced by {@link AdaParser#select_alternative}.
	 * @param ctx the parse tree
	 */
	void enterSelect_alternative(@NotNull AdaParser.Select_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdaParser#select_alternative}.
	 * @param ctx the parse tree
	 */
	void exitSelect_alternative(@NotNull AdaParser.Select_alternativeContext ctx);
}