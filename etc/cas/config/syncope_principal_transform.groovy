def String run(final Object... args) {
    def providedUsername = args[0]
    def logger = args[1]
    logger.debug("Provided Username:[{}] ", providedUsername)
    return providedUsername
}
